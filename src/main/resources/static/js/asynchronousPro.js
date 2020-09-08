const BASE_URL = 'https://jsonplaceholder.typicode.com/posts/';

function jsTest() {
    alert('this is just test.');
}

function createRandomNumber(max){
    return Math.ceil(Math.random() * max);
}

function setDataToView(userId, id, title, body) {
    document.getElementById('userId').innerHTML = userId;
    document.getElementById('id').innerHTML = id;
    document.getElementById('title').innerHTML = title;
    document.getElementById('body').innerHTML = body;
}

function getAPIData() {
    const URL = BASE_URL + createRandomNumber(100);
    const request = new XMLHttpRequest();
    request.open('GET', URL, true);
    request.responseType = 'json';
    request.onload = function () {
        const data = this.response;
        setDataToView(data['userId'], data['id'], data['title'], data['body']);
    }
    request.send();
}