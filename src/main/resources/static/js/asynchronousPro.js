/**
 * JSONPlaceholderのPostsのベースURL
 * @type {string}
 */
const BASE_URL = 'https://jsonplaceholder.typicode.com/posts/';

/**
 * 1~maxまでのランダムな整数を1つ返す関数
 * @param {number} max ランダムな整数の最大値を指定
 * @returns {number}
 */
function createRandomNumber(max){
    return Math.ceil(Math.random() * max);
}

/**
 * other.htmlの該当id部分を引数の値で書き換える関数
 * @param {number} userId ユーザID
 * @param {number} id ID
 * @param {string} title タイトル
 * @param {string} body 本文
 */
function setDataToView(userId, id, title, body) {
    document.getElementById('userId').innerHTML = userId;
    document.getElementById('id').innerHTML = id;
    document.getElementById('title').innerHTML = title;
    document.getElementById('body').innerHTML = body;
}

/**
 * JSONPlaceholderのPostsのうち1つの投稿についてGETリクエストを送信し、レスポンスをother.htmlに反映させる関数
 */
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