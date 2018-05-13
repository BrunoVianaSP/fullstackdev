$(document).ready(main);

function main() {
	$('.btn-collapse').click(function(e) {
		e.preventDefault();
		var $this = $(this);
		var $collapse = $this.closest('.collapse-group').find('.collapse');
		$collapse.collapse('toggle');
	});
}


//Wait for the DOM to be ready
$(function() {
  // Initialize form validation on the registration form.
  // It has the name attribute "contactForm"
  $("form[name='contactForm']").validate({
    // Specify validation rules
    rules: {
      // The key name on the left side is the name attribute
      // of an input field. Validation rules are defined
      // on the right side
      firstName: "required",
      lastName: "required",
      feedback: {
          required: true,
          maxlength: 20
      },  
      email: {
        required: true,
        email: true // Specify that email should be validated by the built-in "email" rule
      },
      password: {
        required: true,
        minlength: 5
      }
    },
    // Specify validation error messages
    messages: {
      firstName: "Please enter your First Name",
      lastName: "Please enter your Last Name",
      password: {
        required: "Please provide a password",
        minlength: "Your password must be at least 5 characters long"
      },
      email: "Please enter a valid email address"
    },
    // Make sure the form is submitted to the destination defined
    // in the "action" attribute of the form when valid
    submitHandler: function(form) {
      form.submit();
    }
  });
});

////Wait for the DOM to be ready
//$(function() {
//  // Initialize form validation on the registration form.
//  // It has the name attribute "registration"
//  $("form[name='registration']").validate({
//    // Specify validation rules
//    rules: {
//      // The key name on the left side is the name attribute
//      // of an input field. Validation rules are defined
//      // on the right side
//      firstName: "required",
//      lastName: "required",
//      feedback: {
//          required: true,
//          maxlength: 20
//      },  
//      email: {
//        required: true,
//        email: true // Specify that email should be validated by the built-in "email" rule
//      },
//      password: {
//        required: true,
//        minlength: 5
//      }
//    },
//    // Specify validation error messages
//    messages: {
//      firstName: "Please enter your First Name",
//      lastName: "Please enter your Last Name",
//      password: {
//        required: "Please provide a password",
//        minlength: "Your password must be at least 5 characters long"
//      },
//      email: "Please enter a valid email address"
//    },
//    // Make sure the form is submitted to the destination defined
//    // in the "action" attribute of the form when valid
//    submitHandler: function(form) {
//      form.submit();
//    }
//  });
//});




//function isAuthenticated() {
//	return true;
//}