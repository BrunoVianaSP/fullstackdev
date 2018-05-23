package application.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;

@Configuration
@EnableJpaRepositories(basePackages="application.backend.persistence.repositories")
@EntityScan(basePackages = "application.backend.persistence.domain.backend")
@EnableTransactionManagement
@PropertySource("file:///${user.home}/.fullstackdev/application-commom.properties")
//@PropertySource("file:///${user.home}/.devopsbuddy/stripe.properties")
public class ApplicationConfig {
	
	@Value("${aws.s3.profile}")
    private String awsProfileName;

	@Bean
    public AmazonS3Client s3Client() {
	
//		BasicAWSCredentials awsCreds = new BasicAWSCredentials(awsProfileName, awsProfileName);
//		AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
//					.withRegion(Regions.fromName(region))
//					.withCredentials(new AWSStaticCredentialsProvider(awsCreds))
//					.build();
		
        AWSCredentials credentials = new ProfileCredentialsProvider(awsProfileName).getCredentials();
        AmazonS3Client s3Client = new AmazonS3Client(credentials);
        Region region = Region.getRegion(Regions.US_WEST_2);
        s3Client.setRegion(region);
        return s3Client;
    }
	
//    @Bean
//    public AmazonS3Client s3Client() {
//        AWSCredentials credentials = new ProfileCredentialsProvider(awsProfileName).getCredentials();
//        AmazonS3Client s3Client = new AmazonS3Client(credentials);
//        Region region = Region.getRegion(Regions.EU_WEST_1);
//        s3Client.setRegion(region);
//        return s3Client;
//    }
}