package Interview_Question;

public class InterviewQuestion {
	
	static void printMatrix(int [][] Matrix ) {
		
		for(int i=0;i<Matrix.length;i++) {
			for(int j=0;j<Matrix[0].length;j++) {
				System.out.print(Matrix[i][j]+" ");
			}			
			System.out.println();
		}
		
	}
	
static int[][] CopyMatrix(int [][] Matrix ) {
	int row=Matrix.length;
	int colum=Matrix[0].length;
	int[][] CopyMatrix=new int[colum][row];
	
		
		for(int i=0;i<Matrix.length;i++) {
			for(int j=0;j<Matrix[0].length;j++) {
				CopyMatrix[i][j]=Matrix[i][j];
			}			
		}
		return CopyMatrix;
	}
	
static int [][] Transpose(int [][] Matrix ) {
	int row=Matrix.length;
	int colum=Matrix[0].length;
	int[][] Transpose_Matrix=new int[colum][row];
	
		for(int i=0;i<colum;i++) {
			for(int j=0;j<row;j++) {
				Transpose_Matrix[i][j]=Matrix[j][i];
			}			
	
		}
	return 	Transpose_Matrix;
	}

static int [][] Filp_Horizontally(int [][] Matrix ) {
	int row=Matrix.length;
	int colum=Matrix[0].length;
	int[][] Filp_Horizontally_Matrix=new int[row][colum];
	Filp_Horizontally_Matrix=CopyMatrix(Matrix);
	
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum/2;j++) {
				Filp_Horizontally_Matrix[i][j] = Matrix[i][row - 1 - j];
				Filp_Horizontally_Matrix[i][row - 1 -j] = Matrix[i][j];
			}			
	
		}
	return 	Filp_Horizontally_Matrix;
	}
	

	public static void main(String[] args) {
		int row=3,colum=3;
		int k=0;
		int[][] Matrix=new int[row][colum];
		int[][] Transpose_Matrix=new int[colum][row];
		int[][] Filp_Horizontally_Matrix=new int[row][colum];
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				Matrix[i][j]=++k;
			}			
		}

		printMatrix(Matrix);
		System.out.println("==================");
		Transpose_Matrix=Transpose(Matrix);
		printMatrix(Transpose_Matrix);
		Transpose_Matrix=Transpose(Matrix);
		Filp_Horizontally_Matrix=Filp_Horizontally(Transpose_Matrix);
		System.out.println("==================");
		printMatrix(Filp_Horizontally_Matrix);

		
    }
}


