function jsTest(){
    alert('this is just test.');
}

const URL = 'https://jsonplaceholder.typicode.com/posts/1';

function getAPIData(){
    const request = new XMLHttpRequest();
    request.open('GET', URL, true);
    request.responseType = 'json';
    request.onload = function(){
        const data = this.response;
        console.log(data);
    }
    request.send();
}