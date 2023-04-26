public class LargeTortoiseSheep implements Shield{

    @Override
    public int protectionShield() {
        return 11;
    }
    
    @Override
    public String toString() {
        return String.format("Панцирь большой черепахи (макс.защита %d)", this.protectionShield());
    }
}