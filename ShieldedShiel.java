public class ShieldedShiel implements Shield {

    @Override
    public int protectionShield() {
        return 6;
    }

    @Override
    public String toString() {
        return String.format("Расколотый щит (макс.защита %d)", this.protectionShield());
    }
    
}
