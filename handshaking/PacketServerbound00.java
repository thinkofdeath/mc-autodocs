
public class PacketServerbound00 extends ga {

   private int a;
   private String b;
   private int c;
   private fa d;


   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readString(255);
      this.c = var1.readUnsignedShort();
      this.d = fa.a(var1.readVarInt());
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeString(this.b);
      var1.writeShort(this.c);
      var1.writeVarInt(this.d.c());
   }

   public void a(jz var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

   public fa c() {
      return this.d;
   }

   public int d() {
      return this.a;
   }
}