package net.minecraft.network.play;

import net.minecraft.chat.IChatMessage;
import net.minecraft.math.Position;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketSetSignContent implements Packet {

   private aqa a;
   private Position b;
   private IChatMessage[] c;


   public PacketSetSignContent() {}

   public PacketSetSignContent(aqa arg_0, Position arg_1, IChatMessage[] arg_2) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = new IChatMessage[]{arg_2[0], arg_2[1], arg_2[2], arg_2[3]};
   }

   public void read(PacketByteBuf in) {
      this.b = in.readPosition();
      this.c = new IChatMessage[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.c[var2] = in.readChat();
      }

   }

   public void write(PacketByteBuf out) {
      out.writePosition(this.b);

      for(int var2 = 0; var2 < 4; ++var2) {
         out.writeChat(this.c[var2]);
      }

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