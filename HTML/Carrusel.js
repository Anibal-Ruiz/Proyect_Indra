const slides = document.querySelectorAll('.carrusel-slide');
const dots = document.querySelectorAll('.carrusel-dot');
const prevBtn = document.querySelector('.carrusel-btn.prev');
const nextBtn = document.querySelector('.carrusel-btn.next');
let current = 0;

function showSlide(index) {
    slides.forEach((slide, i) => {
        slide.classList.toggle('active', i === index);
        dots[i].classList.toggle('active', i === index);
    });
    current = index;
}

prevBtn.addEventListener('click', () => {
    let idx = (current - 1 + slides.length) % slides.length;
    showSlide(idx);
});

nextBtn.addEventListener('click', () => {
    let idx = (current + 1) % slides.length;
    showSlide(idx);
});

dots.forEach((dot, i) => {
    dot.addEventListener('click', () => showSlide(i));
});