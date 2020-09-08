const URL = 'https://jsonplaceholder.typicode.com/posts/1';

function jsTest() {
    alert('this is just test.');
}

function setDataToView(userId, id, title, body) {
    document.getElementById('userId').innerHTML = userId;
    document.getElementById('id').innerHTML = id;
    document.getElementById('title').innerHTML = title;
    document.getElementById('body').innerHTML = body;
}

function getAPIData() {
    const request = new XMLHttpRequest();
    request.open('GET', URL, true);
    request.responseType = 'json';
    request.onload = function () {
        const data = this.response;
        setDataToView(data['userId'], data['id'], data['title'], data['body']);
    }
    request.send();
}