
public class PacketClientbound02 implements hb {

   private go a;
   private byte b;


   public PacketClientbound02() {}

   public PacketClientbound02(go var1) {
      this(var1, (byte)1);
   }

   public PacketClientbound02(go var1, byte var2) {
      this.a = var1;
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.d();
      this.b = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.a(this.a);
      var1.writeByte(this.b);
   }

   public void a(hh var1) {
      var1.a(this);
   }

   public boolean b() {
      return this.b == 1 || this.b == 2;
   }
}
