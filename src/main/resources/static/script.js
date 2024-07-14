document.addEventListener('DOMContentLoaded', function () {
  const memberForm = document.getElementById('memberForm');
  const membersList = document.getElementById('membersList');

  memberForm.addEventListener('submit', function (e) {
    e.preventDefault();

	document.getElementById("submit").addEventListener("click", function() {
    // Replace with your actual API endpoint
    const apiUrl = 'http://localhost:8080/gymXpert/v1/getOwnerDetails';
    const name = document.getElementById('name').value;
    const membershipType = document.getElementById('membershipType').value;

    const member = document.createElement('div');
    member.classList.add('member');
    member.innerHTML = `
      <strong>Name:</strong> ${name}<br>
      <strong>Membership Type:</strong> ${membershipType}
    `;
	    fetch(apiUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            // Handle the data from the API
            console.log(data);
            alert('API call successful! Response logged to console.');
        })
        .catch(error => {
            console.error('There has been a problem with your fetch operation:', error);
            alert('Error calling API. See console for details.');
        });

    membersList.appendChild(member);

    // Clear form fields
    document.getElementById('name').value = '';
    document.getElementById('membershipType').value = 'basic';
  });
});
