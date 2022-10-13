function validate() {
    var fname=document.reg_form.fname;
    var lname=document.reg_form.lname;
    if (fname.value.length <=0) {
        alert("FIRST NAME IS REQUIRED");
        fname.focus();
        return false;
    }
    if (lname.value.length <=0) {
        alert("LAST NAME IS REQUIRED");
        lname.focus();
        return false;
    }
    var faname=document.reg_form.faname;
    if (faname.value.length <=0) {
        alert("FATHER'S NAME IS REQUIRED");
        faname.focus();
        return false;
    }
    var gender = document.reg_form.gender;
    if (gender.value.length<=0) {
        alert("GENDER IS REQUIRED");
        gender.focus;
        return false;

    }
    var dob= document.reg_form.dob;
    if (dob.value.length<=0) {
        alert("DATE OF BIRTH IS REQUIRED");
        dob.focus;
        return false;
    }
    var email=document.reg_form.email;
    if (email.value.length<=0) {
        alert("EMAIL REQUIRED");
        email.focus;
        return false;
    }
    var department =document.reg_form.department;
    if (department.value=="select course") {
        alert("SELECT DEPARTMENT");
        department.focus;
        return false;
    }var contact = document.reg_form.contact;
    if (contact.value.length<=0) {
        alert(" MOBILE NUMBER REQUIRED");
        contact.focus;
        return false;
    }
}
var loadfile= function (event) {
    var image = document.getElementById('output');
    image.src = URL.createObjectURL(event.target.files[0]);
}
    
