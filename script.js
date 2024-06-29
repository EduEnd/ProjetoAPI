const tarefa = document.querySelector("form");
const Ititutlo = document.querySelector(".titulo");
const Idescricao = document.querySelector(".descricao");
const IdataVencimento = document.querySelector(".dataVencimento");

function criarTarefa(){
    fetch("http//localhost:3306/tarefas",
    {
        headers:{
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            titulo: Ititutlo.value,
            descricao: Idescricao.value,
            dataVencimento: IdataVencimento.value
        })
    })
        .then(function(res){console.log(res)})
        .catch(function(res){console.log(res)})
    
};

function limpar(){
        Ititutlo.value ="";
        Idescricao.value ="";
        IdataVencimento.value ="";
}
tarefa.addEventListener('submit',function(event){
    event.preventDefault();

    criarTarefa();
    limpar();
})