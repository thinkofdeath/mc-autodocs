
public class PacketClientbound36 implements hz {

   private Position a;


   public PacketClientbound36() {}

   public PacketClientbound36(Position var1) {
      this.a = var1;
   }

   public void a(ig var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readPosition();
   }

   public void write(PacketBuffer var1) {
      var1.writePosition(this.a);
   }
}
