
public class PacketServerbound00 extends gv {

   private int a;
   private String b;
   private int c;
   private fu d;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readString(255);
      this.c = var1.readUnsignedShort();
      this.d = fu.a(var1.readVarInt());
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeString(this.b);
      var1.writeShort(this.c);
      var1.writeVarInt(this.d.c());
   }

   public void a(le var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

   public fu c() {
      return this.d;
   }

   public int d() {
      return this.a;
   }
}
