document.addEventListener('DOMContentLoaded', function () {
  const memberForm = document.getElementById('memberForm');
  const membersList = document.getElementById('membersList');

  memberForm.addEventListener('submit', function (e) {
    e.preventDefault();

    const name = document.getElementById('name').value;
    const membershipType = document.getElementById('membershipType').value;

    const member = document.createElement('div');
    member.classList.add('member');
    member.innerHTML = `
      <strong>Name:</strong> ${name}<br>
      <strong>Membership Type:</strong> ${membershipType}
    `;

    membersList.appendChild(member);

    // Clear form fields
    document.getElementById('name').value = '';
    document.getElementById('membershipType').value = 'basic';
  });
});
