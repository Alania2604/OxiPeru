//content para acceder a los elementos
//espera que se lea todo el html y luego ejecute alguna funcion
//capturamos datos
//usar fragment evita reflow

const cards=document.getElementById('cards')
const templateCard =document.getElementById('template-card').content 
const fragment= document.createDocumentFragment()

document.addEventListener('DOMContentLoaded',()=>{
    fetchData()
})
cards.addEventListener('click', e=>{
   addCarrito(e)
})
let carrito={}

const fetchData = async()=>{
    try{
        const res= await fetch('api.json')
        const data= await res.json()
        //console.log(data)
        pintarCards(data)
    }catch(error){
        console.log(error)
    }
}

const pintarCards=data =>{
    console.log(data)
    data.forEach(producto => {
        templateCard.querySelector('h5').textContent = producto.title
        templateCard.querySelector('p').textContent = producto.precio
        templateCard.querySelector('img').setAttribute("src", producto.thumbnailUrl)
        templateCard.querySelector('.btn-dark').dataset.id = producto.id
        const clone= templateCard.cloneNode(true)
        fragment.appendChild(clone)
    })
    cards.appendChild(fragment)
}
const addCarrito=e =>{
    //console.log(e.target)
    //console.log(e.target.classList.contains('btn-dark'))
    if(e.target.classList.contains('btn-dark')){
        setCarrito(e.target.parentElement)
    }
    e.stopPropagation()
}
const setCarrito=objeto =>{
    console.log(objeto)
    const producto={
        id: objeto.querySelector('.btn-dark').dataset.id,
        title: objeto.querySelector('h5').textContent,
        precio: objeto.querySelector('p').textContent,
        cantidad: 1
    }
    if(carrito.hasOwnProperty(producto.id)){
        producto.cantidad=carrito[producto.id].cantidad+1
    }
    //creando id
    carrito[producto.id]= {...producto}

    console.log(producto)
}