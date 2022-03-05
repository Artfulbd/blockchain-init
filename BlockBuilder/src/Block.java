/**
 * Block
 */
public class Block {
    private long self_hash;
    private long previous_block_hash;
    private Object data;

    private Block(){}
    
    Block(int previous_block_hash, Object data){
        this.data = data;
        this.previous_block_hash = previous_block_hash;
        this.self_hash = generateHash();
    }

    public long getHesh() {
        return self_hash;
    }

    public long getPreviousBlockHash() {
        return previous_block_hash;
    }


    private long generateHash() {
        final int prime = 31;
        long result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + previous_block_hash;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Block other = (Block) obj;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (previous_block_hash != other.previous_block_hash)
            return false;
        if (self_hash != other.self_hash)
            return false;
        return true;
    }


    

    
}