
public class PacketClientbound0B extends gs {

   private int a;
   private int b;


   public PacketClientbound0B() {}

   public PacketClientbound0B(th var1, int var2) {
      this.a = var1.B();
      this.b = var2;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readUnsignedByte();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(gv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, type=%d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
   }
}
