package net.sf.regadb.db;


/**
 * AaMutationId generated by hbm2java
 */
public class AaMutationId implements java.io.Serializable {

    private short mutationPosition;

    private AaSequence aaSequence;

    public AaMutationId() {
    }

    public AaMutationId(short mutationPosition, AaSequence aaSequence) {
        this.mutationPosition = mutationPosition;
        this.aaSequence = aaSequence;
    }

    public short getMutationPosition() {
        return this.mutationPosition;
    }

    public void setMutationPosition(short mutationPosition) {
        this.mutationPosition = mutationPosition;
    }

    public AaSequence getAaSequence() {
        return this.aaSequence;
    }

    public void setAaSequence(AaSequence aaSequence) {
        this.aaSequence = aaSequence;
    }

}