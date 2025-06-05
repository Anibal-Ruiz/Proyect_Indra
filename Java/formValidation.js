document.addEventListener("DOMContentLoaded", () => {
  const password = document.getElementById("password");
  const mensajePassword = document.getElementById("mensaje-password");

  password.addEventListener("input", () => {
    const regex = new RegExp(password.pattern);
    mensajePassword.style.display = regex.test(password.value) ? "none" : "block";
  });
});

function formValidation() {
  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value.trim();
  const confirmPassword = document.getElementById("confirm-password").value.trim();
  const politicaAceptada = document.getElementById("politica").checked;
  const emailPattern = /^[a-zA-Z0-9._%+-]+@g\.educaand\.es$/;
  
  if (!email || !password || !confirmPassword) {
    Swal.fire("Campos vacíos", "Por favor completa todos los campos.", "warning");
    return;
  }

  const emailValido = /^[^@\s]+@[^@\s]+\.[^@\s]+$/.test(email);
  if (!emailValido) {
    Swal.fire("Email inválido", "Introduce un correo electrónico válido.", "error");
    return;
  }

  const regex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).{8,}$");
  if (!regex.test(password)) {
    Swal.fire(
      "Contraseña inválida",
      "Debe contener al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial.",
      "error"
    );
    return;
  }

  if (password !== confirmPassword) {
    Swal.fire("Error", "Las contraseñas no coinciden.", "error");
    return;
  }

  if (!politicaAceptada) {
    Swal.fire("Política de privacidad", "Debes aceptar la política de privacidad.", "info");
    return;
  }

  Swal.fire("Éxito", "La validación del formulario se ha completado con éxito.", "success");


if (!emailPattern.test(email)) {
  Swal.fire({
    icon: "error",
    title: "Correo inválido",
    text: "El correo debe pertenecer al dominio g.educaand.es",
  });
  return;
}

}
