function validateForm() {
    // Get form values
    const name = document.getElementById('name').value;
    const age = document.getElementById('age').value;
    const email = document.getElementById('email').value;
    const gender = document.getElementById('gender').value;
    const course = document.getElementById('course').value;

    // Check if all fields are filled
    if (name === "" || age === "" || email === "" || gender === "" || course === "") {
        alert("Please fill out all fields.");
        return false;
    }

    // Check if age is a valid number
    if (isNaN(age) || age <= 0) {
        alert("Please enter a valid age.");
        return false;
    }

    // Validate email format
    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    if (!emailPattern.test(email)) {
        alert("Please enter a valid email address.");
        return false;
    }

    // If validation passes
    alert("Form submitted successfully!");
    return true;
}