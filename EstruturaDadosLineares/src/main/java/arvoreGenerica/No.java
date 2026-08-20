package arvoreGenerica;

import java.util.ArrayList;
import java.util.List;

public class No<T> {
    T dado;
    List<No<T>> filhos;

    public No(T dado){
        this.dado = dado;
        this.filhos = new ArrayList<>();
    }

    public void inserirNo(No<T> filho){
        this.filhos.add(filho);
    }

    // identificar se o nó é uma folha
    public boolean noFolha() {
        return this.filhos.isEmpty();
    }

}

