// Write function that takes # input and calculates
// through addition,subtraction, etc and display on html
function addition() {
  let num1 = parseInt(document.getElementById("add_number1").value);
  let num2 = parseInt(document.getElementById("add_number2").value);

  let sum = num1 + num2;

  document.getElementById("add_result").value = sum;
}

function subtraction() {
  let num1 = parseInt(document.getElementById("sub_number1").value);
  let num2 = parseInt(document.getElementById("sub_number2").value);

  let difference = num1 - num2;

  document.getElementById("sub_result").value = difference;
}

function multiply() {
  let num1 = parseInt(document.getElementById("mul_number1").value);
  let num2 = parseInt(document.getElementById("mul_number2").value);

  let product = num1 * num2;

  document.getElementById("mul_result").value = product;
}

function division() {
  let num1 = parseInt(document.getElementById("div_number1").value);
  let num2 = parseInt(document.getElementById("div_number2").value);

  let quotient = num1 / num2;

  document.getElementById("div_result").value = quotient;
}
