public class IronBakler implements Shield{

    @Override
    public int protectionShield() {
        return 8;
    }
    
    @Override
    public String toString() {
        return String.format("Железный баклер (макс.защита %d)", this.protectionShield());
    }
}
