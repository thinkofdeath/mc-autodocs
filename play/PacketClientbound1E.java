
public class PacketClientbound1E extends ga {

   private int a;
   private int b;


   public PacketClientbound1E() {}

   public PacketClientbound1E(int var1, rh var2) {
      this.a = var1;
      this.b = var2.a();
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(gd var1) {
      var1.a(this);
   }
}
