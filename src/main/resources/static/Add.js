document.getElementById("productForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const product = {
        id: Number(document.getElementById("id").value),
        Name: document.getElementById("name").value,
        Description: document.getElementById("desc").value
    };

    fetch("/item/addProduct", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(product)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error("Failed to add product");
        }
        alert("Product added successfully!");
        document.getElementById("productForm").reset();
		window.location.href = "index.html";
    })
    .catch(err => {
        console.error(err);
        alert("Error adding product");
    });
});
