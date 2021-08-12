package one.hazmatdr.hazsecurity.hazsecurity.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockLockedBlock {
    public BlockLockedBlock () {
        super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(-1).harvestLevel(-1).harvestTool(ToolType.PICKAXE));
    }
}
