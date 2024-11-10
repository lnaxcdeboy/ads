function calcularDegraus(alturaDegrau, alturaDesejada) {
    let quantidadeDegraus = alturaDesejada / alturaDegrau;
    return Math.ceil(quantidadeDegraus);
}

// Exemplo de uso:
let alturaDegrau = 0.2; // altura de cada degrau em metros
let alturaDesejada = 3; // altura que o pedreiro deseja alcançar em metros

let degrausNecessarios = calcularDegraus(alturaDegrau, alturaDesejada);
console.log("O pedreiro deverá subir " + degrausNecessarios + " degraus.");