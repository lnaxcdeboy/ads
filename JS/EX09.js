function calcularAumento(salario) {
    let salarioAnterior = salario;
    if (salario < 2500) {
        salario *= 1.25;
    }
    console.log("Salário anterior: " + salarioAnterior.toFixed(2));
    console.log("Novo salário: " + salario.toFixed(2));
}

let salarioEmpregado = 2000; // Exemplo de salário
calcularAumento(salarioEmpregado);
