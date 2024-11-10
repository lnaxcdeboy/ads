function calcularMedia(notas) {
    let soma = 0;
    for (let i = 0; i < notas.length; i++) {
        soma += notas[i];
    }
    let media = soma / notas.length;

    if (media > 6.0) {
        console.log("Aprovado");
    } else if (media === 6.0) {
        console.log("Recuperação");
    } else {
        console.log("Reprovado");
    }
}

let notasAlunos = [7, 8, 6, 5]; // Exemplo de notas
calcularMedia(notasAlunos);
