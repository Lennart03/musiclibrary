export class ContractsListController {

  constructor(apiUrl, $http) {
    this.apiUrl = apiUrl;
    this.$http = $http;
    this.init();
    }


  init() {
    this.title = 'Contact list';
    this.showList = true;
    this.$http.get(`${this.apiUrl}/users`).then((response) => {
      this.contacts = response.data;
    })
  }

  toggleList() {
    this.showList = !this.showList;
  }

  addContact(newContact) {
    var newContact = {
      name: newContact.name,
      email: newContact.email,
      username: newContact.username
    };
    this.contacts.push(newContact);
  }


}
