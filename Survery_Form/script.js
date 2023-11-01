const form = document.getElementById("surveyForm");
const popup = document.getElementById("popup");
const popupData = document.getElementById("popup-data");

function submitForm() {
    if (form.checkValidity()) {
        popupData.innerHTML = `
            <p><strong>First Name:</strong> ${form.firstName.value}</p>
            <p><strong>Last Name:</strong> ${form.lastName.value}</p>
            <p><strong>Date of Birth:</strong> ${form.dob.value}</p>
            <p><strong>Country:</strong> ${form.country.value}</p>
            <p><strong>Gender:</strong> ${getCheckedGender()}</p>
            <p><strong>Profession:</strong> ${form.profession.value}</p>
            <p><strong>Email:</strong> ${form.email.value}</p>
            <p><strong>Mobile Number:</strong> ${form.mobile.value}</p>
        `;
        popup.style.display = "block";
        form.reset();
    } else {
        alert("Please fill in all required fields.");
    }
}

function resetForm() {
    form.reset();
}

function getCheckedGender() {
    const genderCheckboxes = form.querySelectorAll('input[type="checkbox"][name="gender"]');
    const checkedGenders = Array.from(genderCheckboxes)
        .filter(checkbox => checkbox.checked)
        .map(checkbox => checkbox.value);
    return checkedGenders.join(", ");
}

function closePopup() {
    popup.style.display = "none";
}

window.addEventListener("click", (event) => {
    if (event.target === popup) {
        closePopup();
    }
});
