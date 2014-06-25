
public class PacketClientbound12 implements hb {

   private int a;
   private int b;
   private int c;
   private int d;


   public PacketClientbound12() {}

   public PacketClientbound12(ud var1) {
      this(var1.D(), var1.v, var1.w, var1.x);
   }

   public PacketClientbound12(int var1, double var2, double var4, double var6) {
      this.a = var1;
      double var8 = 3.9D;
      if(var2 < -var8) {
         var2 = -var8;
      }

      if(var4 < -var8) {
         var4 = -var8;
      }

      if(var6 < -var8) {
         var6 = -var8;
      }

      if(var2 > var8) {
         var2 = var8;
      }

      if(var4 > var8) {
         var4 = var8;
      }

      if(var6 > var8) {
         var6 = var8;
      }

      this.b = (int)(var2 * 8000.0D);
      this.c = (int)(var4 * 8000.0D);
      this.d = (int)(var6 * 8000.0D);
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readVarInt();
      this.b = var1.readShort();
      this.c = var1.readShort();
      this.d = var1.readShort();
   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a);
      var1.writeShort(this.b);
      var1.writeShort(this.c);
      var1.writeShort(this.d);
   }

   public void a(hh var1) {
      var1.a(this);
   }
}
