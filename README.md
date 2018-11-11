# miniProJava - Mini projeto para a disciplina de Laboratório Multimédia 5


Este projeto consiste numa aplicação para Android que possibilite ao utilizador escolher uma cor (a partir de uma palete) e que permita desenhar retas e circulos utilizando a informação de diversos clicks no ecrã.
Cada objeto terá a cor préviamente escolhida e com uma mínima alteração garantir que todos ficam com a mesma cor.

É necessário fazer um diagrama de classes e a reutilização das classes feitas préviamente (Ponto2D, reta, polígono e círculo) é valorizada.

**Wireframe**:  
![wireframe](https://github.com/Pantaleao/miniProJava/blob/master/wireframes/wireframe.png)
  
**Todo**:  
* Diagrama de classes
* Relatório
* ~~UI~~
* Registo do toque na área de desenho (https://bit.ly/2Feaw4A)  
  ``` private View.OnTouchListener handleTouch = new View.OnTouchListener() {

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("TAG", "touched down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("TAG", "moving: (" + x + ", " + y + ")");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("TAG", "touched up");
                break;
        }

        return true;
    }
}; ```
* Funções de seleção das cores
* Função para alterar a cor de todos os objetos desenhados
* Funções da lista dropdown (Segmento de reta, circulo, polígono(?))
