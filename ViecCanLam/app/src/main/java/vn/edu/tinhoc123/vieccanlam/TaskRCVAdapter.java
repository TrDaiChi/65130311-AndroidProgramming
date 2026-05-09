package vn.edu.tinhoc123.vieccanlam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskRCVAdapter extends RecyclerView.Adapter{
    List<TASK> dataSource;
    public TaskRCVAdapter(List<TASK>DataSource) {
        this.dataSource = DataSource;
    }

    public class TaskViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvTenViec, tvDeadline;
        public int position;
        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvTenViec = itemView.findViewById(R.id.tvTenViec);
            tvDeadline = itemView.findViewById(R.id.tvDeadline);
        }

        @Override
        public void onClick(View v) {
            //lấy vị trí
            int vtClick = getAdapterPosition();
            //lục ở nguồn dữ liệu
            TASK taskClicked = dataSource.get(vtClick);
            //xử lý
            Toast.makeText(v.getContext(), "Bạn vừa chọn việc: " + taskClicked.getName(), Toast.LENGTH_SHORT).show();
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        TaskViewHolder viewHolder = new TaskViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TaskViewHolder viewHolder = (TaskViewHolder) holder;
        TASK task = dataSource.get(position);
        ((TaskViewHolder) holder).tvTenViec.setText(task.getName());
        ((TaskViewHolder) holder).tvDeadline.setText(task.getDate());

    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }
}
