
public class PacketClientbound05 implements ib {

   private Position a;


   public PacketClientbound05() {}

   public PacketClientbound05(Position var1) {
      this.a = var1;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
   }

   public void a(ii var1) {
      var1.a(this);
   }
}
