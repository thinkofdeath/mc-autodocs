
public class PacketClientbound2E extends gj {

   private int a;


   public PacketClientbound2E() {}

   public PacketClientbound2E(int var1) {
      this.a = var1;
   }

   public void a(gm var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeByte(this.a);
   }
}
