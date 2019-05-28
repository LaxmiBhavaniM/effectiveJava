package builderpattern;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlertDetail {

    // required
    private final double detailTypeCd;
    private final String detailTxt;
    private final long keyInd;
    private final String parentEntityName;
    private final double parentEntityId;

    // optional
    private double factorId;
    private Date begEffectiveDtTm;
    private Date endEffectiveDtTm;
    private final List<AlertDetail> childDetails;

    public static class Builder{
        // required
        private final double detailTypeCd;
        private final String detailTxt;
        private final long keyInd;
        private final String parentEntityName;
        private final double parentEntityId;

        // optional fields assigned to default values
        private double factorId = 0;
        private Date begEffectiveDtTm = new Date();
        private Date endEffectiveDtTm = null;
        private List<AlertDetail> childDetails = new ArrayList<>();

        public Builder(double detailTypeCd, String detailTxt, long keyInd, String parentEntityName, double parentEntityId) {
            this.detailTypeCd = detailTypeCd;
            this.detailTxt = detailTxt;
            this.keyInd = keyInd;
            this.parentEntityName = parentEntityName;
            this.parentEntityId = parentEntityId;
        }

        public Builder withFactorId(double factorId){
            this.factorId = factorId;
            return this;
        }

        public Builder withBeginEffectiveDtTm(Date begEffectiveDtTm){
            this.begEffectiveDtTm = begEffectiveDtTm;
            return this;
        }

        public Builder withEndEffectiveDtTm(Date endEffectiveDtTm){
            this.endEffectiveDtTm = endEffectiveDtTm;
            return this;
        }
        public Builder withChildDetails(List<AlertDetail> childDetails){
            this.childDetails = childDetails;
            return this;
        }
        public AlertDetail build(){
            return new AlertDetail(this);
        }
    }

    /**
     * Constructor for a {@link AlertDetail}
     * @param
     */
    private AlertDetail(Builder builder) {  // immutable
        this.detailTypeCd = builder.detailTypeCd;
        this.detailTxt = builder.detailTxt;
        this.keyInd = builder.keyInd;
        this.parentEntityName = builder.parentEntityName;
        this.parentEntityId = builder.parentEntityId;
        this.factorId = builder.factorId;
        this.begEffectiveDtTm = builder.begEffectiveDtTm;
        this.endEffectiveDtTm = builder.endEffectiveDtTm;
        this.childDetails = builder.childDetails;

        if(this.detailTypeCd<=0){
            throw new IllegalStateException();
        }
        if(this.detailTxt==""){
            throw new IllegalStateException();
        }
        if(this.parentEntityName==""){
            throw new IllegalStateException();
        }
        if(this.parentEntityId<=0){
            throw new IllegalStateException();
        }
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.detailTypeCd+", "+this.detailTxt;
	}
}
