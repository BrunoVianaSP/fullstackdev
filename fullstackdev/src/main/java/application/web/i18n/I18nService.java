package application.web.i18n;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class I18nService {

	
	private static final Logger log = LoggerFactory.getLogger(I18nService.class);

	
	@Autowired
	private MessageSource messageSource; 
	
	public String getMessage(String messageId) {
		log.info("Returning i18n text for messageId {}", messageId);
		Locale locale = LocaleContextHolder.getLocale();	
		return getMessage(messageId, locale);
	}

	private String getMessage(String messageId, Locale locale) {
		return messageSource.getMessage(messageId,  null, locale);
	}
}
