package alternate.current.interfaces.mixin;

import alternate.current.redstone.WireBlock;
import alternate.current.redstone.WireNode;

import net.minecraft.util.math.BlockPos;

public interface IChunkSection {
	
	public void clearWires();
	
	public WireNode getWire(WireBlock wireBlock, BlockPos pos);
	
	public WireNode setWire(WireBlock wireBlock, BlockPos pos, WireNode wire);
	
}
