
public class PacketClientbound07 extends gk {

   private int a;
   private qy b;
   private aiz c;
   private ajb d;


   public PacketClientbound07() {}

   public PacketClientbound07(int var1, qy var2, ajb var3, aiz var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(gn var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readInt();
      this.b = qy.a(var1.readUnsignedByte());
      this.c = aiz.a(var1.readUnsignedByte());
      this.d = ajb.a(var1.readString(16));
      if(this.d == null) {
         this.d = ajb.b;
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.writeString(this.d.a());
   }
}
