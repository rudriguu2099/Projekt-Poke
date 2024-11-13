public class Node {
    private boolean isBush;
    private boolean havePokemon;
    private boolean playerOnTop;
    private Pokemon pokemon;


    public Node(boolean isBush, boolean havePokemon, boolean playerOnTop) {
        this.isBush = isBush;
        this.havePokemon = havePokemon;
        this.playerOnTop = playerOnTop;
    }

    public boolean isBush() {
        return isBush;
    }

    public void setBush(boolean isBush) {
        this.isBush = isBush;
    }

    public boolean isHavePokemon() {
        return havePokemon;
    }

    public void setHavePokemon(boolean havePokemon) {
        this.havePokemon = havePokemon;
    }

    public boolean isPlayerOnTop() {
        return playerOnTop;
    }

    public void setPlayerOnTop(boolean playerOnTop) {
        this.playerOnTop = playerOnTop;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}