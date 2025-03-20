document.getElementById('employeeForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const id = document.getElementById('id').value;
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const email = document.getElementById('email').value;
    const phoneNumber = document.getElementById('phoneNumber').value;
    
    const tableBody = document.getElementById('employeeTableBody');
    const row = document.createElement('tr');
    
    row.innerHTML = `
        <td>${id}</td>
        <td>${firstName}</td>
        <td>${lastName}</td>
        <td>${email}</td>
        <td>${phoneNumber}</td>
        <td><button onclick="removeEmployee(this)">Remove</button></td>
    `;
    
    tableBody.appendChild(row);
    
    this.reset();
});

function removeEmployee(button) {
    button.parentElement.parentElement.remove();
}