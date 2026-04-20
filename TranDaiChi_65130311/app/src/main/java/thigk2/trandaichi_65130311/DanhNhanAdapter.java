package thigk2.trandaichi_65130311;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DanhNhanAdapter extends RecyclerView.Adapter<DanhNhanAdapter.ViewHolder> {

    private List<DanhNhan> danhNhanList;

    public DanhNhanAdapter(List<DanhNhan> danhNhanList) {
        this.danhNhanList = danhNhanList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_danhnhan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DanhNhan danhNhan = danhNhanList.get(position);
        holder.tvTen.setText(danhNhan.getTen());
        holder.tvQue.setText(danhNhan.getQueQuan());
        holder.imgHinh.setImageResource(danhNhan.getHinhAnh());
    }

    @Override
    public int getItemCount() {
        return danhNhanList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgHinh;
        TextView tvTen, tvQue;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgHinh = itemView.findViewById(R.id.imgDanhNhan);
            tvTen = itemView.findViewById(R.id.tvTenDanhNhan);
            tvQue = itemView.findViewById(R.id.tvQueQuan);
        }
    }
}