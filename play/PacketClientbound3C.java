
public class PacketClientbound3C implements ib {

   private String a = "";
   private String b = "";
   private int c;
   private lc d;


   public PacketClientbound3C() {}

   public PacketClientbound3C(bqv var1) {
      this.a = var1.e();
      this.b = var1.d().b();
      this.c = var1.c();
      this.d = lc.a;
   }

   public PacketClientbound3C(String var1) {
      this.a = var1;
      this.b = "";
      this.c = 0;
      this.d = lc.b;
   }

   public PacketClientbound3C(String var1, bqt var2) {
      this.a = var1;
      this.b = var2.b();
      this.c = 0;
      this.d = lc.b;
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(40);
      this.d = (lc)var1.readEnum(lc.class);
      this.b = var1.readString(16);
      if(this.d != lc.b) {
         this.c = var1.readVarInt();
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeEnum(this.d);
      var1.writeString(this.b);
      if(this.d != lc.b) {
         var1.writeVarInt(this.c);
      }

   }

   public void a(ii var1) {
      var1.a(this);
   }
}
