package arvoreGenerica;

class Arvore<T> {

    No<T> raiz;

    public Arvore(T dadoRaiz){
        this.raiz = new No<>(dadoRaiz);
    }

    public void adicionarNo(No<T> pai, T dadoFilho){
        if (pai != null){
            No<T> noFilho = new No<>(dadoFilho);
            pai.inserirNo(noFilho);
        }
    }

    public void imprimir(){
        preOrder(this.raiz);
    }

    private void preOrder(No<T> noAtual){
        if (noAtual == null) {
            return;
        }
        System.out.println(noAtual + " ");

        for (No<T> filho : noAtual.filhos) {
            preOrder(noAtual);
        }
    }
}