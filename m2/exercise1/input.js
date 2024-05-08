// Code exercise: write a function that takes input 
function recordName() {
    //get elements
    let name = document.getElementById('name').value;
    let id = document.getElementById('id_number').value;

    //create table for display
    let tr = document.createElement('tr');

    //create colums within the table
    let col1 = tr.appendChild(document.createElement('td'));
    let col2 = tr.appendChild(document.createElement('td'));

    //assign data to the columns
    col1.innerHTML = name;
    col2.innerHTML = id;
    
    //display data in the HTML table
    document.getElementById('table').appendChild(tr);
}
