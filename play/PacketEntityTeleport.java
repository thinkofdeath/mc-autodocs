package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketEntityTeleport implements Packet {

   private int a;
   private int b;
   private int c;
   private int d;
   private byte e;
   private byte f;
   private boolean g;


   public PacketEntityTeleport() {}

   public PacketEntityTeleport(wk arg_0) {
      this.a = arg_0.E();
      this.b = uk.c(arg_0.s * 32.0D);
      this.c = uk.c(arg_0.t * 32.0D);
      this.d = uk.c(arg_0.u * 32.0D);
      this.e = (byte)((int)(arg_0.y * 256.0F / 360.0F));
      this.f = (byte)((int)(arg_0.z * 256.0F / 360.0F));
      this.g = arg_0.C;
   }

   public PacketEntityTeleport(int arg_0, int arg_1, int arg_2, int arg_3, byte arg_4, byte arg_5, boolean arg_6) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_2;
      this.d = arg_3;
      this.e = arg_4;
      this.f = arg_5;
      this.g = arg_6;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readVarInt();
      this.b = in.readInt();
      this.c = in.readInt();
      this.d = in.readInt();
      this.e = in.readByte();
      this.f = in.readByte();
      this.g = in.readBoolean();
   }

   public void write(PacketByteBuf out) {
      out.writeVarInt(this.a);
      out.writeInt(this.b);
      out.writeInt(this.c);
      out.writeInt(this.d);
      out.writeByte(this.e);
      out.writeByte(this.f);
      out.writeBoolean(this.g);
   }

   public void a(ii arg_0) {
      arg_0.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((ii)arg_0);
   }
}