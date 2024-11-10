let nome = prompt("Digite seu nome:");
let anoNascimento = parseInt(prompt("Digite seu ano de nascimento:"));
let anoAtual = parseInt(prompt("Digite o ano atual:"));

let idade = anoAtual - anoNascimento;

alert("Olá, " + nome + "! Você tem " + idade + " anos.");