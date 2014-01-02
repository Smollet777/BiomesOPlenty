package biomesoplenty.common.biomes;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenSludgepit extends BiomeGenBase
{

	@SuppressWarnings("unchecked")
	public BiomeGenSludgepit(int par1)
	{
		super(par1);
		/*
		spawnableCreatureList.clear();
		spawnableWaterCreatureList.clear();
		theBiomeDecorator = new BiomeDecoratorBOP(this);
		customBiomeDecorator = (BiomeDecoratorBOP)theBiomeDecorator;
		customBiomeDecorator.treesPerChunk = 30;
		customBiomeDecorator.grassPerChunk = 30;
		customBiomeDecorator.wheatGrassPerChunk = 10;
		customBiomeDecorator.mushroomsPerChunk = 8;
		customBiomeDecorator.flowersPerChunk = -999;
		customBiomeDecorator.sandPerChunk = -999;
		customBiomeDecorator.sandPerChunk2 = -999;
		customBiomeDecorator.mudPerChunk = 5;
		customBiomeDecorator.mudPerChunk2 = 5;
		customBiomeDecorator.deadBushPerChunk = 5;
		customBiomeDecorator.algaePerChunk = 2;
		customBiomeDecorator.poisonWaterPerChunk = 5;
		customBiomeDecorator.waterReedsPerChunk = 6;
		customBiomeDecorator.koruPerChunk = 1;
		spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 1, 1, 1));
		waterColorMultiplier = 11506176;
		*/
	}
	
	/*
	@Override
	public void decorate(World par1World, Random par2Random, int par3, int par4)
	{
		super.decorate(par1World, par2Random, par3, par4);
		int var5 = 12 + par2Random.nextInt(6);

		for (int var6 = 0; var6 < var5; ++var6)
		{
			int var7 = par3 + par2Random.nextInt(16);
			int var8 = par2Random.nextInt(28) + 4;
			int var9 = par4 + par2Random.nextInt(16);
			int var10 = par1World.getBlockId(var7, var8, var9);

			Block block = Block.blocksList[var10]; 
			if (block != null && block.isGenMineableReplaceable(par1World, var7, var8, var9, Block.stone.blockID))
			{
				par1World.setBlock(var7, var8, var9, Blocks.amethystOre.get().blockID, 10, 2);
			}
		}
	}
	*/

	/**
	 * Gets a WorldGen appropriate for this biome.
	 */
	/*
	@Override
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
		return par1Random.nextInt(3) == 0 ? new WorldGenBog2() : new WorldGenBog1();
	}
	*/

	/**
	 * Gets a WorldGen appropriate for this biome.
	 */
	/*
	@Override
	public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
	{
		return par1Random.nextInt(9) == 0 ? new WorldGenTallGrass(Block.tallGrass.blockID, 0) : new WorldGenTallGrass(Blocks.foliage.get().blockID, 2);
	}
	*/

	/**
	 * Provides the basic grass color based on the biome temperature and rainfall
	 */
	/*
	@Override
	public int getBiomeGrassColor()
	{
		return 7627817;
	}
	*/

	/**
	 * Provides the basic foliage color based on the biome temperature and rainfall
	 */
	/*
	@Override
	public int getBiomeFoliageColor()
	{
		return 9539892;
	}
	
	@Override
	public int getFogColour()
	{
		return 10463856;
	}
	
	@Override
	public float getFogCloseness()
	{
	    // TODO Auto-generated method stub
	    return 0.6F;
	}
	*/

	/**
	 * takes temperature, returns color
	 */
	/*
	@Override
	public int getSkyColorByTemp(float par1)
	{
		if (BOPConfigurationMisc.skyColors)
			return 7039816;
		else
		{
			par1 /= 3.0F;

			if (par1 < -1.0F)
			{
				par1 = -1.0F;
			}

			if (par1 > 1.0F)
			{
				par1 = 1.0F;
			}

			return Color.getHSBColor(0.62222224F - par1 * 0.05F, 0.5F + par1 * 0.1F, 1.0F).getRGB();
		}
	}
	*/
}
