document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("enderecoClienteForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const bairro = document.getElementById("bairro").value;

		const rua = document.getElementById("rua").value;

		const cidade = document.getElementById("cidade").value;

		const numeroCasa = document.getElementById("numeroCasa").value;

		const estado = document.getElementById("estado").value;

        const cep = document.getElementById("cep").value;

        const complemento = document.getElementById("complemento").value;
		try {
			const response = await fetch("http://localhost:8080/endereco", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					bairro,
					rua,
					cidade,
					numeroCasa,
					estado,
                    cep,
                    complemento
				}),
			});

			if (!response.ok) {
				alert("Erro ao cadastrar endereco")
			} else {
				alert("cadastrado com sucesso");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o cliente:", error);
		}
	});
});