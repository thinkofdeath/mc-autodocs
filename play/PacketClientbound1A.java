
public class PacketClientbound1A extends ft {

   private int a;
   private byte b;


   public PacketClientbound1A() {}

   public PacketClientbound1A(rz var1, byte var2) {
      this.a = var1.x();
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = var1.readByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
