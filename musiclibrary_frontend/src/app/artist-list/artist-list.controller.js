export class ArtistListController {

  constructor(apiUrl, $http) {
    console.log("Constructing artistListController");
    console.log(apiUrl);
    console.log($http);
    this.apiUrl = apiUrl;
    this.$http = $http;
    this.init();
    }


  init() {
    this.title = 'Artist list';
    this.showList = true;
    this.$http.get(`${this.apiUrl}/artist`).then((response) => {
      console.log(response.data);
      this.artists = response.data;
    })
  }

  toggleList() {
    this.showList = !this.showList;
    console.log(this.artists);
  }

  addArtist(newArtist) {
    this.$http.post(`${this.apiUrl}/artist/${newArtist.name}`).then((response) => {
      let newArtist = response.data;
      this.artists.push(newArtist);
    });
  }

  artistClicked(artistId) {

  }


}
